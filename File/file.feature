Feature: Register
Scenario: Register to Test ME App
     Given User open TestMeApp
     When User click signup
     And Enter user name as "Shradha"
     And Enter first name as "Shradha"
     And Enter last name as "Jadhav"
     And Enter password as "shots11"
     And Enter confirm password as "shots11"
     And Enter select gender as "Female"
     And Enter email as "sjadhav@gmail.com"  
     And Enter mobile as "5632489751"
     And Enter dob as "01/01/1996"
     And Enter address as "Pune"
     And Enter answer as "Pune"
     Then User click Register 