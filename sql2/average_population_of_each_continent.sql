SELECT COUNTRY.Continent, FLOOR(AVG(CITY.POPULATION)) FROM CITY,COUNTRY WHERE CITY.CountryCode = COUNTRY.Code GROUP BY COUNTRY.Continent;