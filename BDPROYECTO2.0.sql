use ProyectoComidas2

Create table Enc_Pedido(
	ID int IDENTITY primary key not null,
	IDCliente int,
	IDProducto int,
	IDDireccion int,
	FechaEntrega date,
	FechaPedido date
)

Create Table Direccion(
	Id int primary key not null,
	Descripcion varchar(60),
	IdCliente int 
)

Create table DetPedido(
	ID int IDENTITY primary key not null,
	IDProducto int,
	CantProducto int
)

CREATE TABLE [Despacho](
	[ID] [int] NOT NULL,
	[IDFACTURA] [int] NULL,
	[FechaEnvio] [date] NULL,
	[Hora] [date] NULL,
	[IDRetiro] [int] NULL,
	[Monto] [decimal](18, 0) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

Create table DetFactura(
	ID int IDENTITY primary key not null,
	ID_Producto int,
	CantProducto int,
	Total decimal,
)


CREATE TABLE [dbo].[CLLIENTE](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Nombre] [varchar](60) NULL,
	[Apellido1] [varchar](60) NULL,
	[Apellido2] [varchar](60) NULL,
	[Direccion] [varchar](60) NULL,
	[Telefono] [varchar](60) NULL,
	[PosDirEntrega] [varchar](60) NULL,
	[HorarioEntrega] [date] NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO


CREATE TABLE [dbo].[Factura](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[IDCliente] [int] NULL,
	IDUsuario int,
	[NombreCLiente] [varchar](60) NULL,
	[Direccion] [varchar](60) NULL,
	[NombreProducto] [varchar](60) NULL,
	[Impuesto] [decimal](18, 0) NULL,
	[Total] [decimal](18, 0) NULL,
	[IDProducto] [int] NULL,
	[TipoPago] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

CREATE TABLE [dbo].[ProductoVenta](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Nombre] [varchar](60) NULL,
	[RutaImagProducto] [varchar](200) NULL,
	[Precio] [decimal](18, 0) NULL,
	[CantidadMinima] [int] NULL,
	[Cantidad Producto] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

CREATE TABLE [dbo].[Roll](
	[ID] [int] NOT NULL,
	[Descripcion] [varchar](60) NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

CREATE TABLE [dbo].[TipoPago](
	[Estado] [bit] NULL,
	[CuentaPorCobrar] [decimal](18, 0) NULL,
	[Contado] [decimal](18, 0) NULL,
	[ID] [int] IDENTITY(1,1) NOT NULL,
 CONSTRAINT [PK_TipoPago] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

CREATE TABLE [dbo].[Usuario](
	[ID] [int] NOT NULL,
	[NOMBRE] [varchar](60) NULL,
	[Direccion] [varchar](60) NOT NULL,
	[Correo] [varchar](60) NOT NULL,
	[Contrasena] [varchar](60) NOT NULL,
	[Roll] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO