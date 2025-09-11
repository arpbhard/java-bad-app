def test_dependency_version_is_correct():
    assert pom_xml.contains('<version>2.11.0</version>')