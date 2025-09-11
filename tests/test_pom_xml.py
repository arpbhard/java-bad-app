def test_valid_pom_structure():
    assert '<project>' in pom_xml
    assert '<modelVersion>4.0.0</modelVersion>' in pom_xml
    assert '<groupId>com.example</groupId>' in pom_xml
    assert '<artifactId>badapp</artifactId>' in pom_xml
    assert '<version>1.0.0</version>' in pom_xml
    assert '<dependencies>' in pom_xml
    assert '<dependency>' in pom_xml
    assert '<groupId>commons-io</groupId>' in pom_xml
    assert '<artifactId>commons-io</artifactId>' in pom_xml
    assert '<version>2.11.0</version>' in pom_xml
    assert '</dependency>' in pom_xml
    assert '</dependencies>' in pom_xml
    assert '</project>' in pom_xml