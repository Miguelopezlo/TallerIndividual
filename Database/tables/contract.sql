-- TC_GB_04
-- By: Miguel Angel Lopez
-- Date: 2023-11-14
-- Description: creates table CONTRACTS to save all the contracts in the database
-- APP_M_PROV_SELECC definition

CREATE TABLE "APP_M_PROV_SELECC"."CONTRACT" 
   (	"CONTRACTID" NUMBER NOT NULL ENABLE, 
	"CONTRACTDESCRIPTION" VARCHAR2(200) NOT NULL ENABLE, 
	"STARTDATE" DATE NOT NULL ENABLE, 
	"FINISHDATE" DATE NOT NULL ENABLE, 
	"CONTRACTSTATE" VARCHAR2(50) NOT NULL ENABLE, 
	"PRODUCTID" NUMBER NOT NULL ENABLE, 
	"SUPPLIERID" NUMBER NOT NULL ENABLE, 
	 CONSTRAINT "CONTRACT_PK" PRIMARY KEY ("CONTRACTID")