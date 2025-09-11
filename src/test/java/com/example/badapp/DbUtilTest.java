@Test
public void testGetInstanceNotNull() {
    DbUtil dbUtil = DbUtil.getInstance();
    assertNotNull(dbUtil);
}