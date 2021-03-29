#  Конфигурация и События

Считать следующую конфигурацию:  
>app:  
>&nbsp;first-config: 1  
>&nbsp;second-config:  
>&nbsp;subconfig: test_me  
>&nbsp;user: login  
>&nbsp;ttl: 123s  

с помощью аннотации ConfigurationProperties и EnableConfigurationProperties в класс SimpleConfig  

Создать событие ConfigEvent, которое должно публиковаться после старта приложения и должно содержать в себе считанную конфигурацию  
Объявить лисенер нового события , в котором в лог должны выводиться полученная конфигурация из события  

Задание конфигов должно быть в конфигурационных файлах для конкретного какого-то профиля. То есть в зависимости от выбрано профиля должны выводиться в лог разные значения    
Необходимо сделать две реализации (DevSmsSender и ProdSmsSender) интерфейса:  
>interface SmsSender {  
>
>   void send(String phoneNumber, String text);  
>}  

Бин DevSmsSender должен создаваться в случае если выбран профиль dev  
Бин ProdSmsSender во всех остальных случаях  
