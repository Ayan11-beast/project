create table AssetsRegister(

AssetId int primary key,
IssuedOn date,
IssuedToEmployee varchar(6),
ModelNo varchar(50),
Make varchar(25),
AssetType varchar(10)
);
create table SupportTickets(
TicketId int primary key,
TicketRaisedOn date,
TicketRaisedByEmployee varchar(6),
AssetId int,
AssignedToEmployee varchar(6),
ExpectedResolution date,
TicketStatus varchar(10),
foreign key(AssetId) references AssetsRegister(AssetId)
);
create table TicketResolutions(
id int primary key,
ticketId int,
resolutionDate date,
resolutionDescription varchar(100),
foreign key(ticketId) references SupportTickets(TicketId)
);
