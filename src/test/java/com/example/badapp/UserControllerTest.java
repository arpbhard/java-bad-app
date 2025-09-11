public void testSaveUserInvalidEmail() {
    UserController userController = new UserController();
    userController.saveUser("Jane Doe", "jane.doeexample.com");
    // Add assertions here
}