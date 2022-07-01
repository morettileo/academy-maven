
# OperationDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | id dell&#39;operazione |  [optional]
**operationType** | [**OperationTypeEnum**](#OperationTypeEnum) | tipo di operazione | 
**signature** | [**SignatureDTO**](SignatureDTO.md) | dettagli dell&#39;operazione di firma/marcatura temporale: assente per operazioni di altro tipo |  [optional]
**printer** | [**PrinterBaseDTO**](PrinterBaseDTO.md) | dettagli dell&#39;operazione di stampa: assente per operazioni di altro tipo |  [optional]
**outputBundleId** | **String** | id del bundle di output contenente i documenti dopo il processamento |  [optional]
**documents** | [**List&lt;OperationDocumentStateDTO&gt;**](OperationDocumentStateDTO.md) | documenti a cui l&#39;operazione viene applicata |  [optional]
**processingState** | [**ProcessingStateEnum**](#ProcessingStateEnum) | stato dell&#39;operazione |  [optional]
**creationTime** | [**Date**](Date.md) | istante di creazione dell&#39;operazione |  [optional]
**lastActivityTime** | [**Date**](Date.md) | istante dell&#39;ultima attività dell&#39;operazione |  [optional]


<a name="OperationTypeEnum"></a>
## Enum: OperationTypeEnum
Name | Value
---- | -----
SIGN | &quot;SIGN&quot;
PRINT | &quot;PRINT&quot;


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



