/**
 * RideController
 *
 * @description :: Server-side actions for handling incoming requests.
 * @help        :: See https://sailsjs.com/docs/concepts/actions
 */

module.exports = {
    async create(req, res) {
        try {
            let paramas = req.allParamas();
            const ride = await Ride.create(
                {
                    title: paramas.title,
                    start: paramas.start,
                    end: paramas.end,
                    wayPoints: paramas.wayPoints,
                    user: req.user,
                }
            );
            return res.ok(ride);
        } catch (err) {
            return res.serverError({err})
        }
    }

};

