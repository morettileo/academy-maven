
# DocumentDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | id del documento |  [optional]
**documentClientId** | **String** | id del documento assegnato dal client |  [optional]
**documentType** | [**DocumentTypeEnum**](#DocumentTypeEnum) | tipo di documento / tipo di contenuto del documento | 
**content** | **String** | contenuto del documento. Se documentType vale &#39;URI&#39;, contiene la URI attraverso la quale è possibile accedere al documento. Altrimenti contiene il contenuto del documento in formato Base64 | 
**processingState** | [**ProcessingStateEnum**](#ProcessingStateEnum) | stato del documento |  [optional]
**creationTime** | [**Date**](Date.md) | istante di creazione del documento |  [optional]
**lastActivityTime** | [**Date**](Date.md) | istante dell&#39;ultimo utilizzo del documento |  [optional]


<a name="DocumentTypeEnum"></a>
## Enum: DocumentTypeEnum
Name | Value
---- | -----
PDF | &quot;PDF&quot;
RAW | &quot;RAW&quot;
URI | &quot;URI&quot;


<a name="ProcessingStateEnum"></a>
## Enum: ProcessingStateEnum
Name | Value
---- | -----
IDLE | &quot;IDLE&quot;
PENDING | &quot;PENDING&quot;
WORKING | &quot;WORKING&quot;
PAUSED | &quot;PAUSED&quot;
COMPLETED | &quot;COMPLETED&quot;
ERROR | &quot;ERROR&quot;



