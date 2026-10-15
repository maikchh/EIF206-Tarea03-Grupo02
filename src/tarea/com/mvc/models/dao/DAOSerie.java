package tarea.com.mvc.models.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import tarea.com.mvc.models.Conexion;
import tarea.com.mvc.models.Genero;
import tarea.com.mvc.models.Serie;

public class DAOSerie extends Conexion implements DAO <Serie> {

	@Override
	public ArrayList<Serie> all() {
		ArrayList<Serie> data = new ArrayList<>();

		Connection con= conectar();
		String sql ="select * from series";

		try {

			PreparedStatement ps= con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {

				Serie item = new Serie(
						rs.getInt("id_serie"),
						rs.getString("titulo"),
						rs.getInt("temporadas"),
						rs.getDouble("calificacion"),
						rs.getInt("id_genero")
						);
				data.add(item);
			}

		} catch(Exception e){
			e.printStackTrace();
		}finally {
			desconectar(con);
		}

		return data;
	}

	@Override
	public Serie find(int id) {
		Serie item =null;

		Connection con= conectar();
		String sql ="select * from series where id_serie = ?;";

		try {

			PreparedStatement ps= con.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();

			if(rs.next()) {

				item = new Serie(
						rs.getInt("id_serie"),
						rs.getString("titulo"),
						rs.getInt("temporadas"),
						rs.getDouble("calificacion"),
						rs.getInt("id_genero")
						);
			}

		} catch(Exception e){
			e.printStackTrace();
		}finally {
			desconectar(con);
		}



		return item;
	}

	@Override
	public boolean store(Serie item) {
		Connection con= conectar();
		String sql ="insert into series (titulo,temporadas,calificacion,id_genero) values (?,?,?,?);";

		try {

			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, item.getTitulo());
			ps.setInt(2, item.getTemporadas());
			ps.setDouble(3, item.getCalificacion());
			ps.setInt(4, item.getIdGenero());

			ps.execute();

		} catch(Exception e){
			e.printStackTrace();

			return false;
		}finally {
			desconectar(con);
		}


		return true;
	}

	@Override
	public boolean update(Serie item, int id) {
		Connection con= conectar();
		String sql ="update series set titulo = ?,temporadas = ?,calificacion = ?, id_genero = ? where id_serie = ?;";

		try {

			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, item.getTitulo());
			ps.setInt(2, item.getTemporadas());
			ps.setDouble(3, item.getCalificacion());
			ps.setInt(4, item.getIdGenero());
			ps.setInt(5, id);
			ps.execute();

		} catch(Exception e){
			e.printStackTrace();

			return false;
		}finally {
			desconectar(con);
		}


		return true;
	}


	@Override
	public boolean destroy(int id) {
		Connection con= conectar();
		String sql ="delete from series where id_serie = ?";

		try {

			PreparedStatement ps= con.prepareStatement(sql);
			ps.setInt(1,id);

			ps.execute();

		} catch(Exception e){
			e.printStackTrace();

			return false;
		}finally {
			desconectar(con);
		}


		return true;
	}
}


