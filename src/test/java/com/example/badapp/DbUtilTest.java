public void testRawQuery_InvalidSQL() {
    DbUtil dbUtil = DbUtil.getInstance();
    ResultSet resultSet = dbUtil.rawQuery("INVALID SQL");
    assertNull(resultSet);
}