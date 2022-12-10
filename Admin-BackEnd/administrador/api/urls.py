from django.urls import path
from .views import DispositivoView
from .views import UsuarioView

urlpatterns = [
    path('dispositivos/', DispositivoView.as_view(), name='dispositivos_list'),
    path('dispositivos/<int:id>', DispositivoView.as_view(), name='dispositivos_process'),

    path('usuarios/', UsuarioView.as_view(), name='usuarios_list'),
    path('usuarios/<int:id>', UsuarioView.as_view(), name='usuarios_process')

]
