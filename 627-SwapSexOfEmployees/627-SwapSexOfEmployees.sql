-- Last updated: 9/25/2026, 12:51:00 PM
UPDATE Salary
SET sex = CASE
              WHEN sex = 'f' THEN 'm'
              ELSE 'f'
          END;