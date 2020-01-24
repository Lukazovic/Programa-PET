# Programa-PET
Um CRUD desktop com Java Swing e MySQL para ajudar no armazenamento de dados do programa de monitorias PET de Física da universidade UNICENTRO.

### Motivação
Os monitores do Programa PET Física da Unicentro anotavam os dados das monitorias em um caderno, ao final de cada mês um monitor transferia os dados para uma planilha no Excel para gerar gráficos e fazer análises e projetos sobre as monitorias. Eu estava aprendendo Java na faculdade e resolvi aprender a desenvolver uma programa desktop que pudesse auxiliá-los no armazenamento, manipulação e visualização de dados, então busquei conhecimento em cursos, sites, e documentações para colocar em prática este projeto. Fiquei satisfeito com o resultado do programa, pois pude evoluir e aprender muito sobre programação, design e Java.

## Imagens

### Tela de Login
Apenas para servir de proteção para que apenas usuários especifícos tenham acesso ao programa e seus dados.
![Tela de Login](https://github.com/Lukazovic/Programa-PET/blob/master/Imagens%20programa%20PET/Tela%20Login.png)

### Tela Principal
Tela principal do aplicativo desktop, onde é possível ter acesso a novo cadastro de monitorias, a tabela de dados cadastrados no programa, estatísticas das monitorias e uma sessão de Administrador.
![Tela Principal](https://github.com/Lukazovic/Programa-PET/blob/master/Imagens%20programa%20PET/Tela%20principal.png)

### Tela para Cadastro de Novas Monitorias
A tela de cadastro traz funcionalidades de seleção de até 4 monitores cadastrados no programa por monitoria, adicionar o nome do aluno ajudado, o local da monitoria, o curso do aluno, a matéria da monitoria e armazenar o horário da monitoria (com opção de adicionar o horário atual automaticamente).
![Tela Nova Monitoria](https://github.com/Lukazovic/Programa-PET/blob/master/Imagens%20programa%20PET/Tela%20nova%20monitoria.png)

### Tabela de Dados Cadastrados
Tela onde é possível analisar todos os dados das monitorias cadastradas no sistema, com a opção de filtrar as monitorias por monitor, matéria, curso, e data.

Observação: Nesta tela não tem opção de remoção ou edição de dados, apenas leitura, pois penso que essas opção deveriam ser para um usuário com permissões avançadas.
![Dados Cadastrados](https://github.com/Lukazovic/Programa-PET/blob/master/Imagens%20programa%20PET/Tela%20de%20Dados%20Cadastrados.png)

### Tela de Estatísticas das Monitorias
Esta tela foi feita para exibir estatísticamente os dados cadastrados no programa. É possível escolher entre as opções para mostar as estatísticas por matérias, por dias da semana, e mês, também possível filtrar as estatísticas por meses específicos e ainda escolher como estas estatísticas aparecerão na tela, em formato de tabela ou gráfico.
![Filtros de Estatísticas](https://github.com/Lukazovic/Programa-PET/blob/master/Imagens%20programa%20PET/Tela%20para%20Busca%20Estatisticas.png)

### Estatística em Gráfico
Após selecionados alguns filtros na tela da seção anterior, esta tela é como as estatísticas são mostradas se selecionada a opção de mostrar os dados graficamente.
![Grafico de Barra](https://github.com/Lukazovic/Programa-PET/blob/master/Imagens%20programa%20PET/Estat%C3%ADsticas%20com%20gr%C3%A1fico.png)

### Tela de Administrador
Após uma validação de usuário similar a Tela de Login, esta é a tela com as opção de Administrador. Nesta área o usuário tem opções para adicionar, atualizar e remover dados.
![Tela ADM](https://github.com/Lukazovic/Programa-PET/blob/master/Imagens%20programa%20PET/Tela%20Adm.png)

### Tela das opções de Administrador
Nessas telas, que correspondem as três primeiras opções da tela da seção anterior, o usuário pode manipular os dados do cadastro de novos Petianos (Monitores), Cursos e Matérias.
![Tela opcoes ADM](https://github.com/Lukazovic/Programa-PET/blob/master/Imagens%20programa%20PET/Telas%20para%20cadastros.png)

### Tela de Remoção de Monitorias
Nesta tela, o Administrador tem a opção de remover monitorias cadastradas no sitema, caso alguma categoria tenha sido cadastrada errada. Para ajudar a encontrar a monitoria deseja, é possível filtrar as monitorias que aparecem na tela, assim como na seção que mostra os dados cadastrados.
![Tela remoer monitoria](https://github.com/Lukazovic/Programa-PET/blob/master/Imagens%20programa%20PET/Tela%20para%20remover%20monitorias.png)
