public void testGetInstance() {
    DbUtil dbUtil = DbUtil.getInstance();
    assertNotNull(dbUtil);
}