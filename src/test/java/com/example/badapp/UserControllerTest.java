public void testSaveUser_ValidNameAndEmail() {
    UserController userController = new UserController();
    userController.saveUser("John Doe", "john.doe@example.com");
    // Add assertions here
}