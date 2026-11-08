ECOMAP - PONTOS ECOLOGICOS

O EcoMap e um projeto desenvolvido para localizar pontos ecologicos
em Anapolis, facilitando a busca por locais de coleta.

ESTRUTURA DO PROJETO

frontend:
Contem a interface do sistema, o mapa e a exibicao dos pontos.

backend:
Contem a API desenvolvida em Java com Spring Boot.

TECNOLOGIAS UTILIZADAS

- HTML
- CSS
- JavaScript
- Leaflet
- OpenStreetMap
- Java
- Spring Boot
- Maven

COMO EXECUTAR

1. Abrir a pasta backend no VS Code.

2. Abrir o terminal dentro da pasta backend.

3. Executar o backend com:

mvn spring-boot:run

4. A API ficara disponivel em:

http://localhost:8080/api/pontos

5. Abrir a pasta frontend e executar o arquivo index.html
   pelo navegador ou utilizando a extensao Live Server do VS Code.

OBSERVACAO

Os pontos ecologicos desta versao estao cadastrados diretamente
no backend e sao retornados pela API.

O sistema utiliza o OpenStreetMap para apresentar o mapa.
O botao de pesquisa no Google Maps abre uma busca externa.