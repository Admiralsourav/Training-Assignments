
2.1. Job openings form (create_job.html):
page title: Enter Job Data

fields:
   title: text field*
   type: drop down (select)*
   department: drop down (select)*
   country: drop down (select)*
   description: text area*
   opening date: date field (fill with current date)*

   [submit] button

* = required fields
   javascript validations:
     validate that required fields are not blank when submit is clicked
     validate that date value is valid and not greater than current date
