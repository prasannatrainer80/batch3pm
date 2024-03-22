import React, {Component} from 'react';
import { Link } from 'react-router-dom';
// import './menu.scss'
// import { connect } from "react-redux";
// import { bindActionCreators } from "redux";
// import * as menuActions from "../../store/menu/actions";
export default class menu extends Component {
    constructor(props) {
        super(props);
        this.state = {
          cid : localStorage.getItem("custId")
        };
    }
    render() {
      const {cid} = this.state
      return <div className="component-menu">
        <p>Welcome to {cid}</p>
          <Link to="/customerShow">Customer Show</Link>
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <Link to="/menuShow">Menu Show</Link>
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <Link to="/walletShow">Wallet Show</Link>
      </div>;
    }
  }
// export default connect(
//     ({ menu }) => ({ ...menu }),
//     dispatch => bindActionCreators({ ...menuActions }, dispatch)
//   )( menu );