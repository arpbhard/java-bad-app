def test_invalid_artifact_id():
    with pytest.raises(ValueError):
        parse_pom_xml('<project><modelVersion>4.0.0</modelVersion><groupId>com.example</groupId><artifactId>invalid</artifactId></project>')