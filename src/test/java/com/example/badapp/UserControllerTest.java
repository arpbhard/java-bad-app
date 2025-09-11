public void testValidateInvalidEmail() {
    UserController userController = new UserController();
    boolean isValid = userController.validate("invalidemail.com");
    // Add assertion for isValid false
}