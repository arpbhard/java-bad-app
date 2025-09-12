@Test
public void testFinalizeConnectionClosed() {
    DbUtil dbUtil = DbUtil.getInstance();
    Connection connection = dbUtil.connection;
    assertNotNull(connection);
    dbUtil.finalize();
    assertTrue(connection.isClosed());
}