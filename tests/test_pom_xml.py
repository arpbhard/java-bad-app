def test_invalid_dependency_raises_error():
    with pytest.raises(Exception):
        validate_pom_xml(pom_xml)