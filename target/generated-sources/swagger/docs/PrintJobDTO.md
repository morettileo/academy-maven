
# PrintJobDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bundleId** | **String** | id del bundle | 
**operationId** | **String** | id dell&#39;operazione | 
**documentId** | **String** | id del documento | 
**printProgress** | **Long** | progresso di stampa |  [optional]
**processingDetails** | **String** | dettagli sul processamento |  [optional]
**submitDate** | [**Date**](Date.md) | istante di inoltro alla stampante |  [optional]
**processingDate** | [**Date**](Date.md) | istante di processamento della stampa |  [optional]
**processingState** | [**ProcessingStateEnum**](#ProcessingStateEnum) | stato della stampa |  [optional]
**printOptions** | [**PrintOptionsDTO**](PrintOptionsDTO.md) | opzioni della stampa |  [optional]


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



