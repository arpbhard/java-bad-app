public void testFinalize() {
    DbUtil dbUtil = DbUtil.getInstance();
    Connection connection = dbUtil.connection;
    assertNotNull(connection);
    dbUtil.finalize();
    assertTrue(connection.isClosed());
}