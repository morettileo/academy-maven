
# OperationDocumentStateDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | id del documento | 
**processingState** | [**ProcessingStateEnum**](#ProcessingStateEnum) | stato di processamento del documento nell&#39;ambito dell&#39;operazione | 
**processingDetails** | **String** | dettagli aggiuntivi dello stato di processamento, in particolare il messaggio di errore quando processingState è ERROR |  [optional]
**processingDate** | [**Date**](Date.md) | istante in cui è completato il processamento del documento (presente solo se processingState è \&quot;COMPLETED\&quot; o \&quot;ERROR\&quot;) |  [optional]
**printOptions** | [**PrintOptionsDTO**](PrintOptionsDTO.md) | opzioni di stampa |  [optional]
**printProgress** | **Long** | progresso stampa |  [optional]


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



