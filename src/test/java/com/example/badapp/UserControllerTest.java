@Test
public void testValidateInvalidEmail() {
    UserController userController = new UserController();
    boolean isValid = userController.validate("invalidemail");
    // Add assertion to check if email is invalid
}