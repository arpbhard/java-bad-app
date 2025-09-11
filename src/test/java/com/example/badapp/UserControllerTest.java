@Test
public void testSaveUserSuccess() {
    UserController userController = new UserController();
    userController.saveUser("John Doe", "john.doe@example.com");
    // Add assertions to check if user was saved successfully
}