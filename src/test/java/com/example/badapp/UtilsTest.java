public void testMd5Exception() {
    String input = "test";
    PowerMockito.mockStatic(java.security.MessageDigest.class);
    when(MessageDigest.getInstance("MD5")).thenThrow(new NoSuchAlgorithmException());
    String result = Utils.md5(input);
    assertNull(result);
}