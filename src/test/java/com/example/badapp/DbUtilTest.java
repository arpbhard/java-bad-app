@Test
public void testRawQueryInvalidSQL() {
    DbUtil dbUtil = DbUtil.getInstance();
    ResultSet resultSet = dbUtil.rawQuery("INVALID SQL");
    assertNull(resultSet);
}