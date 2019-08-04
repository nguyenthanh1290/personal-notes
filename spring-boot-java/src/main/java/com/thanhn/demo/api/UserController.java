package com.thanhn.demo.api;

import com.thanhn.demo.api.resourceassembler.UserResourceAssembler;
import com.thanhn.demo.entity.User;
import com.thanhn.demo.exception.UserNotFoundException;
import com.thanhn.demo.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@RestController
@RequestMapping("/api/users")
@Slf4j
public class UserController {
    private final UserRepository userRepository;
    private final UserResourceAssembler assembler;

    public UserController(UserRepository userRepository, UserResourceAssembler assembler) {
        this.userRepository = userRepository;
        this.assembler = assembler;
    }

    @GetMapping("")
    public Resources<Resource<User>> all() {
        List<Resource<User>> users = StreamSupport.stream(userRepository.findAll().spliterator(), false)
                .map(assembler::toResource)
                .collect(Collectors.toList());

        return new Resources<>(users,
                linkTo(methodOn(UserController.class).all()).withSelfRel());
    }

    @GetMapping("/{id}")
    public Resource<User> one(@PathVariable Long id) {
        return assembler.toResource(
                userRepository.findById(id)
                        .orElseThrow(() -> new UserNotFoundException(id)));
    }

    @PostMapping("")
    public ResponseEntity<?> newUser(@RequestBody User newUser) throws URISyntaxException {
        Resource<User> resource = assembler.toResource(userRepository.save(newUser));

        return ResponseEntity
                .created(new URI(resource.getId().expand().getHref()))
                .body(resource);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> replaceUser(@RequestBody User newUser, @PathVariable Long id) throws URISyntaxException {
        log.info("replacing user " + id);
        User updatedUser = userRepository.findById(id)
                .map(user -> {
                    user.setName(newUser.getName());
                    user.setEmail(newUser.getEmail());
                    return userRepository.save(user);
                })
                .orElseGet(() -> {
                    newUser.setId(id);
                    return userRepository.save(newUser);
                });

        Resource<User> resource = assembler.toResource((updatedUser));

        return ResponseEntity
                .created(new URI(resource.getId().expand().getHref()))
                .body(resource);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);

        return ResponseEntity.noContent().build();
    }
}
