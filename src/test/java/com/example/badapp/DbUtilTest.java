@Test
public void testRawQueryValidSQL() {
    DbUtil dbUtil = DbUtil.getInstance();
    ResultSet resultSet = dbUtil.rawQuery("SELECT * FROM table");
    assertNotNull(resultSet);
}