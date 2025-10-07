--1
SELECT * FROM SalesLT.Customer;

--2
SELECT * FROM SalesLT.Product;

--3
SELECT FirstName, LastName, EmailAddress 
FROM SalesLT.Customer;

--4
SELECT Name, ListPrice 
FROM SalesLT.Product;

--5
SELECT COUNT(*) AS TotalCustomers 
FROM SalesLT.Customer;

--6
SELECT COUNT(*) AS TotalProducts
FROM SalesLT.Product;

--7
SELECT DISTINCT Color
FROM SalesLT.Product
WHERE Color IS NOT NULL;

--8
SELECT TOP 10 Name, ListPrice
FROM SalesLT.Product
ORDER BY ListPrice DESC;

--9
SELECT *
FROM SalesLT.SalesOrderHeader;

--10
SELECT Name, ProductNumber, StandardCost
FROM SalesLT.Product
WHERE SellEndDate IS NULL;

--11
SELECT Name, ListPrice 
FROM SalesLT.Product 
WHERE ListPrice > 1000;

--12
SELECT FirstName, LastName, CompanyName 
FROM SalesLT.Customer c
JOIN SalesLT.CustomerAddress ca ON c.CustomerID = ca.CustomerID
JOIN SalesLT.Address a ON ca.AddressID = a.AddressID
WHERE a.City = 'Seattle';

--13
SELECT Name, Color, ListPrice 
FROM SalesLT.Product 
WHERE Color = 'Red';

--14
SELECT SalesOrderID, OrderDate, TotalDue 
FROM SalesLT.SalesOrderHeader 
WHERE YEAR(OrderDate) = 2008;

--15
SELECT Name, ListPrice 
FROM SalesLT.Product 
WHERE ListPrice BETWEEN 100 AND 500;

--16
SELECT FirstName, LastName, EmailAddress
FROM SalesLT.Customer
WHERE EmailAddress LIKE '%adventure-works.com';

--17
SELECT Name, ListPrice
FROM SalesLT.Product
WHERE Name LIKE 'Mountain%';

--18
SELECT Name, ProductNumber
FROM SalesLT.Product
WHERE Color IS NULL;

--19
SELECT FirstName, LastName, Phone
FROM SalesLT.Customer
WHERE Phone IS NOT NULL;

--20
SELECT p.Name, p.ProductNumber, pc.Name AS CategoryName
FROM SalesLT.Product p
JOIN SalesLT.ProductCategory pc ON p.ProductCategoryID = pc.ProductCategoryID
WHERE pc.Name IN ('Helmets', 'Gloves');

select count(*) as TotalProducts 
from SalesLT.product;

select count(color) as Totalproducts
from SalesLT.Product;

select count(*) 
from SalesLT.Product
where color is not null;

select count(*) 
from SalesLT."Product"
where color is null;

select count(distinct Color)
from SalesLT."product"
where color is not null;

select APPROX_COUNT_DISTINCT(color) 
from SalesLT."Product"
where Color is not null;

--SQL provides built-in aggregate functions to calculate statistical variance directly.
--Statistical variance in SQL measures how much numeric values differ from their average. 
--It shows the data’s spread—whether values are close to or far from the mean.
--SQL uses `VAR()` for sample variance (divides by n-1) and `VARP()` for population variance (divides by n). 
--Low variance means data points are close together; high variance means they’re more spread out. 
--It’s useful for analyzing variability and risk in data.
--Used in finance, economics, and quality control to access risk, volatity, and consistency.


--more variance means more skewed dataset.


--21
SELECT AVG(ListPrice) AS AveragePrice 
FROM SalesLT.Product;

--22
SELECT SUM(TotalDue) AS TotalSales 
FROM SalesLT.SalesOrderHeader;

--23
SELECT MAX(ListPrice) AS MaxPrice 
FROM SalesLT.Product;

--24
SELECT MIN(ListPrice) AS MinPrice 
FROM SalesLT.Product 
WHERE ListPrice > 0;

--25
SELECT Color, COUNT(*) AS ProductCount 
FROM SalesLT.Product 
WHERE Color IS NOT NULL 
GROUP BY Color;

--26
SELECT YEAR(OrderDate) AS OrderYear, AVG(TotalDue) AS AverageOrderTotal
FROM SalesLT.SalesOrderHeader
GROUP BY YEAR(OrderDate)
ORDER BY OrderYear;

--27
SELECT p.Name, SUM(sod.OrderQty) AS TotalUnitsSold
FROM SalesLT.SalesOrderDetail sod
JOIN SalesLT.Product p ON sod.ProductID = p.ProductID
GROUP BY p.Name
ORDER BY TotalUnitsSold DESC;

--28
SELECT CustomerID, COUNT(*) AS OrdersPlaced
FROM SalesLT.SalesOrderHeader
GROUP BY CustomerID
ORDER BY OrdersPlaced DESC;

--29
SELECT pc.Name AS CategoryName, AVG(p.ListPrice) AS AveragePrice
FROM SalesLT.Product p
JOIN SalesLT.ProductCategory pc ON p.ProductCategoryID = pc.ProductCategoryID
GROUP BY pc.Name
ORDER BY AveragePrice DESC;

--30
SELECT 
    YEAR(OrderDate) AS OrderYear, 
    MONTH(OrderDate) AS OrderMonth, 
    SUM(TotalDue) AS MonthlySales
FROM SalesLT.SalesOrderHeader
GROUP BY YEAR(OrderDate), MONTH(OrderDate)
ORDER BY OrderYear, OrderMonth;

--31
SELECT p.Name AS ProductName, pc.Name AS CategoryName 
FROM SalesLT.Product p
INNER JOIN SalesLT.ProductCategory pc ON p.ProductCategoryID = pc.ProductCategoryID;

--32
SELECT soh.SalesOrderID, c.FirstName, c.LastName, soh.OrderDate, soh.TotalDue 
FROM SalesLT.SalesOrderHeader soh
INNER JOIN SalesLT.Customer c ON soh.CustomerID = c.CustomerID;

--33
SELECT sod.SalesOrderID, p.Name, sod.OrderQty, sod.UnitPrice, sod.LineTotal 
FROM SalesLT.SalesOrderDetail sod
INNER JOIN SalesLT.Product p ON sod.ProductID = p.ProductID;

--34
SELECT c.FirstName, c.LastName, a.AddressLine1, a.City, a.StateProvince, a.PostalCode 
FROM SalesLT.Customer c
INNER JOIN SalesLT.CustomerAddress ca ON c.CustomerID = ca.CustomerID
INNER JOIN SalesLT.Address a ON ca.AddressID = a.AddressID;

--35
SELECT p.Name AS ProductName, pc.Name AS Category, pcp.Name AS ParentCategory 
FROM SalesLT.Product p
INNER JOIN SalesLT.ProductCategory pc ON p.ProductCategoryID = pc.ProductCategoryID
LEFT JOIN SalesLT.ProductCategory pcp ON pc.ParentProductCategoryID = pcp.ProductCategoryID;

SELECT soh.SalesOrderID, c.FirstName, c.LastName, p.Name AS ProductName, sod.OrderQty, sod.UnitPrice, sod.LineTotal
FROM SalesLT.SalesOrderHeader soh
INNER JOIN SalesLT.Customer c ON soh.CustomerID = c.CustomerID
INNER JOIN SalesLT.SalesOrderDetail sod ON soh.SalesOrderID = sod.SalesOrderID
INNER JOIN SalesLT.Product p ON sod.ProductID = p.ProductID;

SELECT p.ProductID, p.Name 
FROM SalesLT.Product p
LEFT JOIN SalesLT.SalesOrderDetail sod ON p.ProductID = sod.ProductID
WHERE sod.ProductID IS NULL;

SELECT c.CustomerID, c.FirstName, c.LastName, SUM(soh.TotalDue) AS TotalSpent
FROM SalesLT.Customer c
INNER JOIN SalesLT.SalesOrderHeader soh ON c.CustomerID = soh.CustomerID
GROUP BY c.CustomerID, c.FirstName, c.LastName;

SELECT pm.Name AS ProductModel, pd.Description
FROM SalesLT.ProductModel pm
INNER JOIN SalesLT.ProductModelProductDescription pmpd ON pm.ProductModelID = pmpd.ProductModelID
INNER JOIN SalesLT.ProductDescription pd ON pmpd.ProductDescriptionID = pd.ProductDescriptionID
WHERE pmpd.Culture = 'en';

SELECT soh.SalesOrderID, a.AddressLine1, a.City, a.StateProvince, a.PostalCode
FROM SalesLT.SalesOrderHeader soh
INNER JOIN SalesLT.Address a ON soh.ShipToAddressID = a.AddressID;

SELECT pc.Name AS Category, COUNT(*) AS ProductCount 
FROM SalesLT.Product p
INNER JOIN SalesLT.ProductCategory pc ON p.ProductCategoryID = pc.ProductCategoryID 
GROUP BY pc.Name 
HAVING COUNT(*) > 10;

SELECT c.CustomerID, c.FirstName, c.LastName, SUM(soh.TotalDue) AS TotalPurchases 
FROM SalesLT.Customer c
INNER JOIN SalesLT.SalesOrderHeader soh ON c.CustomerID = soh.CustomerID 
GROUP BY c.CustomerID, c.FirstName, c.LastName 
HAVING SUM(soh.TotalDue) > 10000;

SELECT p.ProductID, p.Name, SUM(sod.OrderQty) AS TotalSold 
FROM SalesLT.Product p
INNER JOIN SalesLT.SalesOrderDetail sod ON p.ProductID = sod.ProductID 
GROUP BY p.ProductID, p.Name 
HAVING SUM(sod.OrderQty) > 100;


--offset

-- GROUP BY & HAVING (41-50)
-- ============================================

-- 41. List categories with more than 10 products.
-- Problem: For each product category, count the number of products and show only those with more than 10.
-- Hint: GROUP BY category, HAVING COUNT(*) > 10.
SELECT pc.Name AS Category, COUNT(*) AS ProductCount 
FROM SalesLT.Product p
INNER JOIN SalesLT.ProductCategory pc ON p.ProductCategoryID = pc.ProductCategoryID 
GROUP BY pc.Name 
HAVING COUNT(*) > 10;

-- 42. List customers who have spent more than $10,000.
-- Problem: For each customer, sum their total purchases and show only those who spent over $10,000.
-- Hint: GROUP BY customer, HAVING SUM(TotalDue) > 10000.
SELECT c.CustomerID, c.FirstName, c.LastName, SUM(soh.TotalDue) AS TotalPurchases 
FROM SalesLT.Customer c
INNER JOIN SalesLT.SalesOrderHeader soh ON c.CustomerID = soh.CustomerID 
GROUP BY c.CustomerID, c.FirstName, c.LastName 
HAVING SUM(soh.TotalDue) > 10000;

-- 43. List products sold more than 100 times.
-- Problem: For each product, sum the quantity sold and show only those with more than 100 units sold.
-- Hint: GROUP BY product, HAVING SUM(OrderQty) > 100.
SELECT p.ProductID, p.Name, SUM(sod.OrderQty) AS TotalSold 
FROM SalesLT.Product p
INNER JOIN SalesLT.SalesOrderDetail sod ON p.ProductID = sod.ProductID 
GROUP BY p.ProductID, p.Name 
HAVING SUM(sod.OrderQty) > 100;

-- 44. List colors with an average product price over $500.
-- Problem: For each color, calculate the average ListPrice and show only those with an average above $500.
-- Hint: GROUP BY Color, HAVING AVG(ListPrice) > 500, filter out NULLs.
SELECT Color, AVG(ListPrice) AS AvgPrice, COUNT(*) AS ProductCount 
FROM SalesLT.Product 
WHERE Color IS NOT NULL 
GROUP BY Color 
HAVING AVG(ListPrice) > 500;

-- 45. List years where sales exceeded $1 million.
-- Problem: For each year, sum the TotalDue and show only years with sales over $1,000,000.
-- Hint: GROUP BY YEAR(OrderDate), HAVING SUM(TotalDue) > 1000000.
SELECT YEAR(OrderDate) AS Year, SUM(TotalDue) AS TotalSales 
FROM SalesLT.SalesOrderHeader 
GROUP BY YEAR(OrderDate) 
HAVING SUM(TotalDue) > 1000000;

-- 46
SELECT CustomerID
FROM Orders
GROUP BY CustomerID
HAVING COUNT(*) > 3;

-- 47
SELECT ProductID
FROM OrderDetails
GROUP BY ProductID
HAVING AVG(OrderQty) > 5;

-- 48
SELECT City
FROM Customers
GROUP BY City
HAVING COUNT(DISTINCT CustomerID) > 5;

-- 49
SELECT CategoryID
FROM Products
JOIN OrderDetails ON Products.ProductID = OrderDetails.ProductID
GROUP BY CategoryID
HAVING SUM(LineTotal) > 50000;

-- 50
SELECT YEAR(OrderDate) AS OrderYear, MONTH(OrderDate) AS OrderMonth
FROM Orders
GROUP BY YEAR(OrderDate), MONTH(OrderDate)
HAVING COUNT(*) > 50;

-- 51
SELECT Name, ListPrice 
FROM SalesLT.Product 
WHERE ListPrice > (SELECT AVG(ListPrice) FROM SalesLT.Product);

-- 52
SELECT CustomerID, FirstName, LastName 
FROM SalesLT.Customer 
WHERE CustomerID IN (
    SELECT CustomerID 
    FROM SalesLT.SalesOrderHeader 
    WHERE YEAR(OrderDate) = 2008
);

-- 53
SELECT p.Name, p.ListPrice, pc.Name AS Category 
FROM SalesLT.Product p
INNER JOIN SalesLT.ProductCategory pc ON p.ProductCategoryID = pc.ProductCategoryID 
WHERE p.ListPrice = (
    SELECT MAX(p2.ListPrice) 
    FROM SalesLT.Product p2 
    WHERE p2.ProductCategoryID = p.ProductCategoryID
);

-- 54
SELECT c.CustomerID, c.FirstName, c.LastName, SUM(soh.TotalDue) AS TotalPurchases 
FROM SalesLT.Customer c
INNER JOIN SalesLT.SalesOrderHeader soh ON c.CustomerID = soh.CustomerID 
GROUP BY c.CustomerID, c.FirstName, c.LastName 
HAVING SUM(soh.TotalDue) > (
    SELECT AVG(CustomerTotal) 
    FROM (
        SELECT SUM(TotalDue) AS CustomerTotal 
        FROM SalesLT.SalesOrderHeader 
        GROUP BY CustomerID
    ) AS Totals
);

-- 55
SELECT ProductID, Name 
FROM SalesLT.Product 
WHERE ProductID NOT IN (
    SELECT DISTINCT ProductID 
    FROM SalesLT.SalesOrderDetail
);

-- 56
SELECT SalesOrderID, TotalDue
FROM SalesLT.SalesOrderHeader
WHERE TotalDue > (
    SELECT AVG(TotalDue)
    FROM SalesLT.SalesOrderHeader
);

-- 57
SELECT TOP 5 c.CustomerID, c.FirstName, c.LastName, SUM(soh.TotalDue) AS TotalPurchases
FROM SalesLT.Customer c
JOIN SalesLT.SalesOrderHeader soh ON c.CustomerID = soh.CustomerID
GROUP BY c.CustomerID, c.FirstName, c.LastName
ORDER BY TotalPurchases DESC;

-- 58
SELECT p.ProductID, p.Name, p.ListPrice
FROM SalesLT.Product p
WHERE p.ProductCategoryID = (
    SELECT TOP 1 ProductCategoryID
    FROM SalesLT.Product
    GROUP BY ProductCategoryID
    ORDER BY AVG(ListPrice) DESC
);

-- 59
SELECT CustomerID, FirstName, LastName, City
FROM SalesLT.Customer
WHERE City IN (
    SELECT TOP 3 City
    FROM SalesLT.Customer
    GROUP BY City
    ORDER BY COUNT(*) DESC
);

-- 60
SELECT p.ProductID, p.Name, p.ListPrice
FROM SalesLT.Product p
WHERE p.ListPrice > (
    SELECT AVG(p2.ListPrice)
    FROM SalesLT.Product p2
    WHERE p2.ProductCategoryID = p.ProductCategoryID
);

-- 61
SELECT DATENAME(WEEKDAY, OrderDate) AS DayOfWeek, COUNT(*) AS OrderCount 
FROM SalesLT.SalesOrderHeader 
GROUP BY DATENAME(WEEKDAY, OrderDate) 
ORDER BY OrderCount DESC;

-- 62
SELECT SalesOrderID, OrderDate, TotalDue 
FROM SalesLT.SalesOrderHeader 
WHERE OrderDate >= DATEADD(DAY, -30, (SELECT MAX(OrderDate) FROM SalesLT.SalesOrderHeader));

-- 63
SELECT Name, SellStartDate, DATEDIFF(DAY, SellStartDate, GETDATE()) AS DaysOld 
FROM SalesLT.Product 
ORDER BY DaysOld DESC;

-- 64
SELECT YEAR(OrderDate) AS Year, DATEPART(QUARTER, OrderDate) AS Quarter, COUNT(*) AS OrderCount 
FROM SalesLT.SalesOrderHeader 
GROUP BY YEAR(OrderDate), DATEPART(QUARTER, OrderDate) 
ORDER BY Year, Quarter;

-- 65
SELECT Name, SellStartDate 
FROM SalesLT.Product 
WHERE YEAR(SellStartDate) = 2005;

-- 66
SELECT SalesOrderID, OrderDate, ShipDate, DATEDIFF(DAY, OrderDate, ShipDate) AS DaysToShip
FROM SalesLT.SalesOrderHeader
WHERE ShipDate IS NOT NULL;

-- 67
SELECT FORMAT(OrderDate, 'yyyy-MM') AS OrderMonth, COUNT(*) AS OrderCount, SUM(TotalDue) AS TotalSales
FROM SalesLT.SalesOrderHeader
GROUP BY FORMAT(OrderDate, 'yyyy-MM')
ORDER BY OrderMonth;

-- 68
SELECT ProductID, Name, SellStartDate, SellEndDate
FROM SalesLT.Product
WHERE SellStartDate <= GETDATE()
AND (SellEndDate IS NULL OR SellEndDate >= GETDATE());

-- 69
SELECT CustomerID, MIN(OrderDate) AS FirstOrderDate, MAX(OrderDate) AS LastOrderDate
FROM SalesLT.SalesOrderHeader
GROUP BY CustomerID;

-- 70
SELECT ProductID, Name, SellEndDate
FROM SalesLT.Product
WHERE YEAR(SellEndDate) = 2006;



