import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;
public class PlayerSelectionSystem {

	public List<String> playersBasedOnHeightWeight (double minHeight, double maxWeight){
		
		// Fill your code here	
		List<String> playerList=new ArrayList<String>();
		try{
		    Connection con=DB.getConnection();
		    String query= "select * from player where height >="+minHeight+"AND WEIGHT <="+maxWeight+"order by playerName";
		    Statement st= con.createStatement();
		    ResultSet rs=st.executeQuery(query);
		    while(rs.next()){
            playerList.add(rs.getString("playername"));
		    
		    }
		    st.close();
		    con.close();
		}
		catch(ClassNotFoundException | SQLException e){
		    e.printStackTrace();
		}
		return playerList;
	}
}
