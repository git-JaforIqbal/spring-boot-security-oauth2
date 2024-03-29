--------------------------------------------------------
--  File created - Tuesday-October-01-2019   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table OAUTH_CLIENT_DETAILS
--------------------------------------------------------

  CREATE TABLE "HR"."OAUTH_CLIENT_DETAILS" 
   (	"CLIENT_ID" VARCHAR2(256 BYTE), 
	"RESOURCE_IDS" VARCHAR2(256 BYTE), 
	"CLIENT_SECRET" VARCHAR2(256 BYTE), 
	"SCOPE" VARCHAR2(256 BYTE), 
	"AUTHORIZED_GRANT_TYPES" VARCHAR2(256 BYTE), 
	"WEB_SERVER_REDIRECT_URI" VARCHAR2(256 BYTE), 
	"AUTHORITIES" VARCHAR2(256 BYTE), 
	"ACCESS_TOKEN_VALIDITY" NUMBER(10,0), 
	"REFRESH_TOKEN_VALIDITY" NUMBER(10,0), 
	"ADDITIONAL_INFORMATION" VARCHAR2(2096 BYTE), 
	"AUTOAPPROVE" VARCHAR2(256 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into HR.OAUTH_CLIENT_DETAILS
SET DEFINE OFF;
Insert into HR.OAUTH_CLIENT_DETAILS (CLIENT_ID,RESOURCE_IDS,CLIENT_SECRET,SCOPE,AUTHORIZED_GRANT_TYPES,WEB_SERVER_REDIRECT_URI,AUTHORITIES,ACCESS_TOKEN_VALIDITY,REFRESH_TOKEN_VALIDITY,ADDITIONAL_INFORMATION,AUTOAPPROVE) values ('my-client','resource_id','$2a$10$2cUKToQKv3nwwpHKYLBBfuZRqp0X85DvuW95Sm3QwOXxAgRyrcdXi','read,write,trust','password,authorization_code,refresh_token','resource_id','CLIENT',600,300,null,null);
--------------------------------------------------------
--  DDL for Index SYS_C0011239
--------------------------------------------------------

  CREATE UNIQUE INDEX "HR"."SYS_C0011239" ON "HR"."OAUTH_CLIENT_DETAILS" ("CLIENT_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table OAUTH_CLIENT_DETAILS
--------------------------------------------------------

  ALTER TABLE "HR"."OAUTH_CLIENT_DETAILS" ADD PRIMARY KEY ("CLIENT_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
