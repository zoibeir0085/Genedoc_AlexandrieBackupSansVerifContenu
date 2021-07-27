Feature: AlexandrieScenarioFeature
  This feature deals with the login functionality of the application

  Scenario Outline: Scenario Alexandrie1
    Given I navigate to the login page
    And I enter "<username>" and "<password>"
    And I click login button
    Then I navigate to the engagement page
    Then I enter the engagement code : "<engagement code>"
    Then I select the engagement
    Then I validate the engagement
    #Then I logout
    #Then I verify that the pdf was successfully downloaded
    #Then I verify the contenu of the pdf "<cont1>" ,"<cont2>","<cont3>","<cont4>","<cont5>","<cont6>","<cont7>","<cont8>"
    Then I close the browser
    Examples:
      | username        | password | engagement code | cont1   | cont2                           | cont3            | cont4    | cont5           | cont6             | cont7      | cont8     |
      #| rgauvin@kpmg.fr | aezan75  | 1766186         | Ngk Spark Plugs (France) | aumur CS 50009 92354 LE PLESSIS ROBINSON CEDEX | 9 avenue R | Renaud Laggiard | KPMG AUDIT IS | Paris La D |Paris La D|Paris La D|
      | rgauvin@kpmg.fr | aezan75  | 1691869         | 366 SAS | 101 boulevard Murat  75016 PARIS | Olivier Fontaine | 366 SAS | KPMG AUDIT FS I | 2 Avenue Gambetta | Paris La D | Tour EQHO |
      #| rgauvin@kpmg.fr | aezan75  | 1634675        | Ahlstrom Munksj | Rottersac  | Laurent PREVOST | Renaud Laggiard | KPMG AUDIT IS | Paris La D |
      #| rgauvin@kpmg.fr | aezan75  | 1766186         | Ngk Spark Plugs (France) | aumur CS 50009 92354 LE PLESSIS ROBINSON CEDEX | 9 avenue R | Renaud Laggiard | KPMG AUDIT IS | Paris La D |      | rgauvin@kpmg.fr | aezan75  | 1766186         | Ngk Spark Plugs (France) | aumur CS 50009 92354 LE PLESSIS ROBINSON CEDEX | 9 avenue R | Renaud Laggiard | KPMG AUDIT IS | Paris La D |


