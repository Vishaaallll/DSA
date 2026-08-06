# Write your MySQL query statement below
Select p.product_id , IFNULL(ROUND(SUM(p.price*u.units )/ SUM(u.units),2),0) AS average_price
From Prices p
Left join UnitsSold u
On p.product_id = u.product_id
And u.purchase_date >= p.start_date And u.purchase_date <= p.end_date
Group by p.product_id