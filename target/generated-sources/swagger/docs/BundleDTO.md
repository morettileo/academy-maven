
# BundleDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | id del bundle |  [optional]
**documents** | [**List&lt;DocumentDTO&gt;**](DocumentDTO.md) | elenco dei documenti contenuti nel bundle ordinati per priorità di processamento: il primo documento dell&#39;array è il primo ad essere processato |  [optional]
**operations** | [**List&lt;OperationDTO&gt;**](OperationDTO.md) | elenco delle operazioni associate al bundle |  [optional]
**processingState** | [**ProcessingStateEnum**](#ProcessingStateEnum) | stato del bundle |  [optional]
**creationTime** | [**Date**](Date.md) | istante di creazione del bundle |  [optional]
**lastActivityTime** | [**Date**](Date.md) | istante dell&#39;ultimo utilizzo del bundle |  [optional]


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



