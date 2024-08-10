Feature: Upload File

  @Upload
  Scenario: Verify file is uploaded
    When I launch uploadfile website
    Then I should see uploadfile option and click on Radio Option

  @Frame
  Scenario: Verify frame is selected
    When I launch uploadfile website
    Then I should see and click frame