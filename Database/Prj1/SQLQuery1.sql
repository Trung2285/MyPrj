use Project1

create table Laliga(24/25)
(
	ID_Club     INT PRIMARY KEY IDENTITY(1,1),
	ClubName    NVARCHAR(50) NOT NULL,
	City        NVARCHAR(50),
	Stadium     NVARCHAR(50),
	Capacity    INT,
	Establish   INT,
	Chairperson NVARCHAR(30),
	Coach(HLV)  NVARCHAR(30),
	Website     NVARCHAR(255)
)