<%-- 
    Document   : editarCategoria
    Created on : 04-jul-2012, 21:18:07
    Author     : Agustin Suaña
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<!-- paulirish.com/2008/conditional-stylesheets-vs-css-hacks-answer-neither/ -->
<!--[if lt IE 7]> <html class="no-js ie6 oldie" lang="en"> <![endif]-->
<!--[if IE 7]>    <html class="no-js ie7 oldie" lang="en"> <![endif]-->
<!--[if IE 8]>    <html class="no-js ie8 oldie" lang="en"> <![endif]-->
<!-- Consider adding a manifest.appcache: h5bp.com/d/Offline -->
<!--[if gt IE 8]><!-->
<html class="no-js" lang="en">
    <!--<![endif]-->
    <head>
        <meta charset="utf-8">
        <!-- DNS prefetch -->
        <!-- Use the .htaccess and remove these lines to avoid edge case issues.
        More info: h5bp.com/b/378 -->
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

        <title>Sistema de Ventas - Administracion </title>
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- Mobile viewport optimized: j.mp/bplateviewport -->
        <meta name="viewport" content="width=device-width,initial-scale=1">

        <!-- Place favicon.ico and apple-touch-icon.png in the root directory:
        mathiasbynens.be/notes/touch-icons -->

        <!-- CSS -->
        <link rel="stylesheet" href="css/960gs/fluid.css"> <!-- 960.gs Grid System -->
        <!-- The HTML5-Boilerplate CSS styling -->
        <link rel="stylesheet" href="css/h5bp/normalize.css"> <!-- RECOMMENDED: H5BP reset styles -->
        <link rel="stylesheet" href="css/h5bp/non-semantic.helper.classes.css"> <!-- RECOMMENDED: H5BP helpers (e.g. .clear or .hidden) -->
        <link rel="stylesheet" href="css/h5bp/print.styles.css"> <!-- OPTIONAL: H5BP print styles -->
        <!-- The main styling -->
        <link rel="stylesheet" href="css/sprites.css"> <!-- STRONGLY RECOMMENDED: Basic sprites (e.g. buttons, jGrowl) -->
        <link rel="stylesheet" href="css/header.css"> <!-- REQUIRED: Header styling -->
        <link rel="stylesheet" href="css/navigation.css"> <!-- REQUIRED: Navigation styling -->
        <link rel="stylesheet" href="css/sidebar.css"> <!-- OPTIONAL: Sidebar -->
        <link rel="stylesheet" href="css/content.css"> <!-- REQUIRED: Content styling -->
        <link rel="stylesheet" href="css/footer.css"> <!-- REQUIRED: Footer styling -->
        <link rel="stylesheet" href="css/typographics.css"> <!-- REQUIRED: Typographics -->
        <link rel="stylesheet" href="css/ie.fixes.css"> <!-- OPTIONAL: Fixes for IE7 -->
        <!-- Sprites styling -->
        <link rel="stylesheet" href="css/sprite.forms.css"> <!-- SPRITE: Forms styling -->
        <link rel="stylesheet" href="css/sprite.lists.css"> <!-- SPRITE: Lists styling -->
        <link rel="stylesheet" href="css/sprite.tables.css"> <!-- SPRITE: Tables styling -->
        <link rel="stylesheet" href="css/icons.css"> <!-- Icons -->
        <!-- Styling of JS plugins -->
        <link rel="stylesheet" href="css/external/jquery-ui-1.8.16.custom.css">	<!-- PLUGIN: jQuery UI styling -->


        <!-- More ideas for your <head> here: h5bp.com/d/head-Tips -->
        <link rel="stylesheet" href="css/sidebar.css"> <!-- TODO: Remove this line! -->
        <!-- All JavaScript at the bottom, except this Modernizr build incl. Respond.js
        Respond is a polyfill for min/max-width media queries. Modernizr enables HTML5
        elements & feature detects;
        for optimal performance, create your own custom Modernizr build:
        www.modernizr.com/download/ -->
        <script src="js/libs/modernizr-2.0.6.min.js"></script>
    </head>
    <body>
        <!-- Begin of #height-wrapper -->
        <div id="height-wrapper">
            <!-- Begin of header -->
            <header>
                <!-- Begin of the header toolbar -->
                <div id="header_toolbar">
                    <div class="container_12">
                        <h1 class="grid_8">Sistema de Ventas - Administracion </h1>
                        <!-- Start of right part -->
                        <div class="grid_4">
                            <!-- A large toolbar button -->
                            <div class="toolbar_large">
                                <div class="toolbutton">
                                    <div class="toolmenu">
                                        <div class="toolcaption">
                                            <span>Teoria de Lenguajes</span>
                                        </div>
                                    </div>
                                </div>
                            </div> <!-- End of large toolbar button -->
                        </div>
                        <!-- End of right part -->
                    </div>
                </div>
                <!-- End of the header toolbar -->

                <!-- Start of the main header bar -->
                <nav id="header_main">
                    <div class="container_12">
                        <!-- Start of the main navigation -->
                        <ul id="nav_main">
                            <li>
                                <a href="inicio">
                                    <img src="img/icons/25x25/dark/home.png" width=25 height=25 alt="">
                                    Inicio</a>
                            </li>
                            <li>
                                <a href="listadoClientes">
                                    <img src="img/icons/25x25/dark/admin-user.png" width=25 height=25 alt="">
                                    Clientes</a>
                            </li>
                            <li>
                                <a href="listadoProveedores">
                                    <img src="img/icons/25x25/dark/users.png" width=25 height=25 alt="">
                                    Proveedores</a>
                            </li>
                            <li class="current">
                                <a href="listadoCategorias">
                                    <img src="img/icons/25x25/dark/archive.png" width=25 height=25 alt="">
                                    Categorias</a>
                            </li>
                            <li>
                                <a href="listadoProductos">
                                    <img src="img/icons/25x25/dark/computer-imac.png" width=25 height=25 alt="">
                                    Productos</a>
                            </li>
                            <li>
                                <a href="listadoOperaciones">
                                    <img src="img/icons/25x25/dark/shopping-cart.png" width=25 height=25 alt="">
                                    Operaciones</a>
                            </li>
                        </ul>
                        <!-- End of the main navigation -->
                    </div>
                </nav>
            </header>

            <!-- Start of the content -->
            <div role="main" class="container_12" id="content-wrapper">
                <div id="main_content">
                    <h2 class="grid_12"><a href="inicio">Inicio</a>&nbsp;>><a href="listadoCategorias">&nbsp;Categorias</a>&nbsp;>><a href="nuevoCliente">&nbsp;Nuevo</a></h2>
                    <div class="clear"></div>

                    <div class="grid_5">
                        <div class="box">
                            <div class="header">
                                <img src="img/icons/packs/fugue/16x16/grid.png" alt="" width="16"
                                     height="16">
                                <h3>Registro de Categoria de Productos</h3>
                                <span></span>
                            </div>
                            <div class="content">
                                <s:form action="actualizarCategoria" method="post">
                                    <s:textfield label="CODIGO" name="categoria.id"></s:textfield>
                                    <s:textfield label="NOMBRE" name="categoria.nombre"></s:textfield>
                                    <s:textfield label="DESCRIPCION" name="categoria.descripcion"></s:textfield>
                                    <s:submit value="ACTUALIZAR"></s:submit>
                                    <s:reset value="LIMPIAR"></s:reset>
                                </s:form></div> <!-- End of .content -->
                        </div> <!-- End of .box -->
                    </div> <!-- End of .grid_6 -->
                    <div class="clear"></div>
                </div>
            </div>
            <div class="push clear"></div>

        </div> <!-- End of #content-wrapper -->
        <div class="clear"></div>
        <div class="push"></div> <!-- BUGFIX if problems with sidebar in Chrome -->

    </div> <!-- End of #height-wrapper -->			

    <!-- JavaScript at the bottom for fast page loading -->
    <!-- Grab Google CDN's jQuery + jQueryUI, with a protocol relative URL; fall back to local -->		
    <script src="js/libs/jquery-1.7.1.js"></script>
    <script src="js/libs/jquery-ui-1.8.16.min.js"></script>

    <!-- scripts concatenated and minified via build script -->
    <script defer src="js/plugins.js"></script> <!-- REQUIRED: Different own jQuery plugnis -->
    <script defer src="js/mylibs/jquery.ba-resize.js"></script> <!-- RECOMMENDED when using sidebar: page resizing -->
    <script defer src="js/mylibs/jquery.easing.1.3.js"></script> <!-- RECOMMENDED: box animations -->
    <script defer src="js/mylibs/jquery.ui.touch-punch.js"></script> <!-- RECOMMENDED: touch compatibility -->
    <script defer src="js/mylibs/jquery.chosen.js"></script>
    <script defer src="js/mylibs/jquery.validate.js"></script>
    <script defer src="js/script.js"></script> <!-- REQUIRED: Generic scripts -->
    <!-- end scripts -->
    <script>
        $(window).load(function() {
            $('#accordion').accordion();
            $(window).resize();
        });
    </script>

    <!-- Prompt IE 6 users to install Chrome Frame. Remove this if you want to
    support IE 6.
    chromium.org/developers/how-tos/chrome-frame-getting-started -->
    <!--[if lt IE 7 ]>
    <script defer
    src="//ajax.googleapis.com/ajax/libs/chrome-frame/1.0.3/CFInstall.min.js"></script>
    <script
    defer>window.attachEvent('onload',function(){CFInstall.check({mode:'overlay'})})</script>
    <![endif]-->
</body>
</html>