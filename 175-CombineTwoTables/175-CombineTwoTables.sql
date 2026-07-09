-- Last updated: 7/9/2026, 3:08:16 PM

SELECT Person.firstName, Person.lastName, Address.city, Address.state
FROM Person
LEFT JOIN Address ON Person.personId=Address.personId;