module.exports = grunt => {
  // Configure main project settings
  grunt.initConfig({
    pkg: grunt.file.readJSON("package.json"),

    // Plugins' name
    uglify: {
      options: {
        compress: true,
        banner: '/*! <%= pkg.name %> <%= grunt.template.today("yyyy-mm-dd") %> */\n'
      },
      dist: {
        files: {
          "scripts/main.min.js": ["scripts/main.js"]
        }
      }
    },
    sass: {
      dist: {
        files: {
          "styles/css/main.css": ["styles/sass/main.scss"]
        }
      }
    },
    cssmin: {
      combine: {
        files: {
          "styles/css/main.min.css": ["styles/css/main.css"]
        }
      }
    }
  });

  // Load plugins
  grunt.loadNpmTasks("grunt-contrib-uglify");
  grunt.loadNpmTasks("grunt-contrib-sass");
  grunt.loadNpmTasks("grunt-contrib-cssmin");

  // Run the task
  grunt.registerTask("default", ["uglify", "sass", "cssmin"]);
};
