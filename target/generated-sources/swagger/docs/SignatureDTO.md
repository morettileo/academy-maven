
# SignatureDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hsmId** | **String** | id del dispositivo di firma/marcatura | 
**keyAlias** | **String** | chiave da utilizzare per l&#39;operazione | 
**reason** | **String** | motivo dell&#39;operazione (motivo della firma e/o della marcatura) |  [optional]
**location** | **String** | luogo in cui è avvenuta l&#39;operazione |  [optional]
**credentials** | [**CredentialsDTO**](CredentialsDTO.md) | credenziali di accesso al dispositivo, disponibili in sola scrittura: non vengono mai restituite da una GET |  [optional]
**label** | [**LabelDTO**](LabelDTO.md) | etichetta visibile nel documento che attesta l&#39;avvenuta firma |  [optional]



