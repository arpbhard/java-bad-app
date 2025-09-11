def test_missing_model_version():
    with pytest.raises(ValueError):
        parse_pom_xml('<project><groupId>com.example</groupId></project>')