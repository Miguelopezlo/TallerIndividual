-- TC_GB_04
-- By: Miguel Angel Lopez
-- Date: 2023-11-14
-- Description: creates table LOG_TRANSACTION_TABLE to save all transactions on table CONTRACTS
-- APP_M_PROV_SELECC.LOG_TRANSACTION_TABLE definition

CREATE TABLE "APP_M_PROV_SELECC"."LOG_TRANSACTION_TABLE" 
   (	"TRANSACTION_ID" NUMBER, 
	"REGISTRY_DATE" TIMESTAMP (6), 
	"DESCRIPTION" VARCHAR2(255)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;