public void testRawQuery_ValidSQL() {
    DbUtil dbUtil = DbUtil.getInstance();
    ResultSet resultSet = dbUtil.rawQuery("SELECT * FROM table");
    assertNotNull(resultSet);
}