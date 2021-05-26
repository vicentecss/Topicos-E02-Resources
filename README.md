# Tópicos Android E02: Recursos

Professor: João Eduardo Montandon

**Objetivo: Compreender a função da pasta `res` para construção de um aplicativo**

## Clone do projeto

Neste curso, nós iremos utilizar o GitHub como ferramenta de disponibilização e entrega das atividades.
Portanto, é necessário que você tenha feito o tutorial Git & GitHub primeiro.
Consulte o professor em caso de dúvidas.

**IMPORTANTE: VOCÊ DEVERÁ REALIZAR UM COMMIT APÓS A IMPLEMENTAÇÃO DE CADA TAREFA**

## Externalizando strings para um arquivo específico

No momento, todo o texto do aplicativo está sendo fornecido diretamente no componente.
Contudo isso não é uma boa prática de programação pois não isola a aparência/comportamento do aplicativo de seu conteúdo, o que dificulta a manutenção de tais informações.

Como primeira tarefa, você deverá criar um arquivo chamado `strings_activity_main.xml` que irá armazenar os textos utilizados tanto para os componentes da tela (`TextView` e `Button`) como também pelo `Toast` presente no evento de click do botão.

**TL;DR: Crie um arquivo de strings para a tela activity_main contendo o texto utilizado pela tela.** 

## Tema Gold

O Android vem por padrão com um tema baseado em tons de roxo.
Atualize o tema do aplicativo para que ele seja agora baseado em tons de dourado, no mesmo molde da cor aplicada no `TextView`.
Para isso você precisará realizar as seguintes modificações:
Utilize este [link](https://www.htmlcsscolor.com/hex/D4AF37) para obter a paleta de cores de dourado e customizar corretamente o app.

1. Atualizar o arquivo `colors.xml` para incluir a nova paleta de cores. Utilize as cores presentes `Shades of Metallic Gold`.
1. Atualize os arquivos `themes.xml` para considerar agora as cores que você criou no arquivo `colors.xml`
1. Faça as devidas alterações nos componentes presentes no layout `activity_main.xml`, caso necessário.

**TL;DR: Aplique o tema gold junto ao aplicativo.**

## Extraindo os valores das dimensões

Assim como foi feito com o texto do aplicativo, crie um arquivo chamado `dimens_activity_main.xml` dentro da pasta values, e extraia os valores relacionados às dimensões dos componentes (margin, size, padding, etc).

**TL;DR: ORLY?**

## Je ne parle pas portugais

Utilize os recursos de internacionalização para fornecer os textos do aplicativo nas seguintes línguas:

1. Português (default)
1. Inglês (en)
1. Francês (fr)

**TL;DR: Por meio da internacionalização, forneça traduções do texto para francês e inglês.**


