public void testValidateValidEmail() {
    UserController userController = new UserController();
    boolean isValid = userController.validate("test@example.com");
    // Add assertion for isValid true
}