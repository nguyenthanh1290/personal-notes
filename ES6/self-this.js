function CustomerService() {
}

CustomerService.prototype.getCustomer = function(custId) {
  console.log("Get Customer: " + custId);
};

CustomerService.prototype.updateCustomerCheck = function(customerAccount) {
  console.log("Trace in updateCustomerCheck()");
  /*
  var self = this;
  self.getCustomer(customerAccount);
  */
  this.getCustomer(customerAccount);
};

var customerService = new CustomerService();
customerService.updateCustomerCheck("cusAcc");

var cust = new CustomerService();
cust.updateCustomerCheck('sfd');