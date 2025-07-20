select unique_id, e.name
from Employees e
left JOin EmployeeUNI using (id)