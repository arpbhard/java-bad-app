def test_missing_dependency_version():
    with pytest.raises(ValueError):
        parse_pom_xml('<project><modelVersion>4.0.0</modelVersion><groupId>com.example</groupId><artifactId>badapp</artifactId><dependencies><dependency><groupId>commons-io</groupId><artifactId>commons-io</artifactId></dependency></dependencies></project>')